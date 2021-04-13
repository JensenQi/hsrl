package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkCultist_1807 : Card() {
    override val id = 1807
    override val name = "黑暗教徒"
    override val description = "<b>亡语：</b> 随机使一个友方随从获得+3生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Naxx
    override val background = "诅咒教派最近在招新的时候遇到很多阻力。不能拉横幅，不能写标语，不能搞游行，很难制造声势。"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/772e71770d03937ef38b6fd26926e873a52ff9c378d7dbcc162f9445e8f0c061.png"
}
