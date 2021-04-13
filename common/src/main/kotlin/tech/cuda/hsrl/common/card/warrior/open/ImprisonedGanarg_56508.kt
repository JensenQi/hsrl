package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedGanarg_56508 : Card() {
    override val id = 56508
    override val name = "被禁锢的甘尔葛"
    override val description = "<b>休眠</b>两回合。 唤醒时，装备一把3/2的斧子。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "厂家直销炽炎战斧。预计两回合送达。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c40f459da414a0a512d5060b29a9feb2ed400e0e8b7a95ac6b40e1d5de709a5.png"
}
