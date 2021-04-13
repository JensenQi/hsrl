package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedHomunculus_56624 : Card() {
    override val id = 56624
    override val name = "被禁锢的矮劣魔"
    override val description = "<b>休眠</b>两回合。<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "由于言辞粗鄙惨遭禁闭。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b7ee7b480f41a8197250511c53f30dcecce28905fd5f91d4c5ea4d290a0e1951.png"
}
