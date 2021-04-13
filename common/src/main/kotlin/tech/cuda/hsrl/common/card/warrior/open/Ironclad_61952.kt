package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ironclad_61952 : Card() {
    override val id = 61952
    override val name = "铁甲战车"
    override val description = "<b>战吼：</b>如果你的英雄拥有护甲值，便获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "底盘离地间隙仅有两厘米，根本过不了减速带。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca7d557c84d3bb5f0e09f5b4dd3b81fb8268de632ff27cad859e75e74954bcd9.png"
}
