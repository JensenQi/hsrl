package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiderBomb_48185 : Card() {
    override val id = 48185
    override val name = "蜘蛛炸弹"
    override val description = "<b>磁力</b> <b>亡语：</b>随机消灭一个敌方随从。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "击败强敌，惩奸除恶。小心，蜘蛛炸弹来啦！"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a5f9c0c150a7dd489f2e3ea42b21f42c97c5eb7f04af03411cb7241a2e54a207.png"
}
