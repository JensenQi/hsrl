package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Venomizer_47842 : Card() {
    override val id = 47842
    override val name = "毒箭机器人"
    override val description = "<b>磁力</b> <b>剧毒</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "因携带违禁品常年无法通过安检。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/737bb43d92d817096f3c6611533f064496d1c26940b7e4d25b00cd052ef436e9.png"
}
