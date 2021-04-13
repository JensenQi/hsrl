package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CursedVagrant_56379 : Card() {
    override val id = 56379
    override val name = "被诅咒的流浪者"
    override val description = "<b>亡语：</b>召唤一个7/5并具有<b>潜行</b>的阴影。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "他不知道的是……被诅咒的其实是那根塔布羊腿。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f172fefe95a9d2daaa5bbaf207109a74371f5cb39708a407d3d53868706d1735.png"
}
