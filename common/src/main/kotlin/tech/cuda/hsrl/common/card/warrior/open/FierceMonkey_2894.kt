package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FierceMonkey_2894 : Card() {
    override val id = 2894
    override val name = "凶暴猿猴"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Loe
    override val background = "山中无老虎，猴子称大王。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c5cdd5d52bde1ca6d89ec5b0256f3fc2329c9ab1b54f1c035a3bd4546510e9a.png"
}
