package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Armagedillo_53800 : Card() {
    override val id = 53800
    override val name = "硕铠鼠"
    override val description = "<b>嘲讽</b> 在你的回合结束时，使你手牌中所有<b>嘲讽</b>随从牌获得+2/+2。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "或许我们永远都不会知道究竟是什么招惹了它，但我们永远都不会忘记招惹它的后果。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b7f3546d22e12cb75a3aaff8b821d4ce5cfdc2ea52c670d4935093d6f6fd733c.png"
}
