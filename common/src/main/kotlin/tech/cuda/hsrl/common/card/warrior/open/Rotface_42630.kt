package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rotface_42630 : Card() {
    override val id = 42630
    override val name = "腐面"
    override val description = "在该随从受到伤害并没有死亡后，随机召唤一个<b>传说</b>随从。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "爸爸！我觉得我创造了一个传说！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c0fffef9019c301d83e046085ddce6693e7aa7dc7774f050ca318b3d15824e68.png"
}
