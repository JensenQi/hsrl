package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DynOMatic_48542 : Card() {
    override val id = 48542
    override val name = "掷弹机器人"
    override val description = "<b>战吼：</b>造成5点伤害，随机分配到所有非机械随从身上。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "实验室球队的明星投手。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b0dc37a0e56051a6438fbf0d05eb662c35348836e596b5efd4d22e5535186f92.png"
}
