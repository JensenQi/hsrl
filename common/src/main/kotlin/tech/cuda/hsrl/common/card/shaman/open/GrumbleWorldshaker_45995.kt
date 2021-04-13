package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrumbleWorldshaker_45995 : Card() {
    override val id = 45995
    override val name = "撼世者格朗勃尔"
    override val description = "<b>战吼：</b> 将你的其他随从移回你的手牌，并使其法力值消耗变为（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "撼世者发出了隆隆的雷声，洞穴之外的狗头人都开始颤抖。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/090518d04050b3a4d6a830e54e6f1916f0e59584ec50a836391e691d974cdd57.png"
}
