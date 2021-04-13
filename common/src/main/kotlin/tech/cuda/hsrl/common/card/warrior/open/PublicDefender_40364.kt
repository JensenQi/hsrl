package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PublicDefender_40364 : Card() {
    override val id = 40364
    override val name = "公辩律师"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 2
    override var health: Int? = 7
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "我反对！你说什么我都反对！"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3685a3477ab9d67da03cd3be475182bb27af22c6c64b6dc5b3c7135d2a5b3e98.png"
}
