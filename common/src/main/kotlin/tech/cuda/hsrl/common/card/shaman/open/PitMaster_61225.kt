package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PitMaster_61225 : Card() {
    override val id = 61225
    override val name = "死斗场管理者"
    override val description = "<b>战吼：</b>召唤一个3/2的决斗者。<b>腐蚀：</b>召唤两个。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "要是你打赢了最后的决斗，他就送你一个毛绒玩具。"
    override val artist = "Konstantin Porubov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/839ac82ed9dae0f431d99701a7d92a84a4a97e9b3fc83f291de569acb085a65a.png"
}
