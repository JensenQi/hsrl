package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MurgurMurgurgle_56444 : Card() {
    override val id = 56444
    override val name = "莫戈尔·莫戈尔格"
    override val description = "<b>圣盾</b> <b>亡语：</b>将“终极莫戈尔格”洗入你的牌库。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "鱼人并非外域的本地物种。当阳鳃鱼人踏上这片土地时，它们之中的一员挺身而出，迎击这个黑暗世界的种种挑战。它们叫它……莫戈尔。莫戈尔·莫戈尔格。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3d9c7170f9412d20fb11331e9f2d8c3d308c31385d3b69bde34ad1019810bdb.png"
}
