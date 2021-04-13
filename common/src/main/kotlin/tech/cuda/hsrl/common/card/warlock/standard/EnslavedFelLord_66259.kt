package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnslavedFelLord_66259 : Card() {
    override val id = 66259
    override val name = "被奴役的邪能领主"
    override val description = "<b>嘲讽</b> 同时对其攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 7
    override var health: Int? = 10
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "他其实没被困住，戴着这副链子只是为了震慑太过粗野的小鬼。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/55d70e484b928a1cd68c8ac5f96ab0fc7d948c1d5c09bfe2ed17486d1e6ef772.png"
}
