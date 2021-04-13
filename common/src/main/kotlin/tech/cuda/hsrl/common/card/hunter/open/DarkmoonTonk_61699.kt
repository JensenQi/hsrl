package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkmoonTonk_61699 : Card() {
    override val id = 61699
    override val name = "暗月坦克"
    override val description = "<b>亡语：</b>随机对敌人发射四枚飞弹，每枚飞弹造成2点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“油满，出发！”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7abb2382deb8d6bd5beeea2d51b538ad908bea9fa8ef82228307005c22591382.png"
}
