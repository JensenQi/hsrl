package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Arcanosmith_39491 : Card() {
    override val id = 39491
    override val name = "奥能铁匠"
    override val description = "<b>战吼：</b>召唤一个0/5并具有<b>嘲讽</b>的随从。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "除去这个花哨的头衔，他就是一名普通的铁匠。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bdadb10dde7a80fc21d47561c74a382824d7f13cf43ea780bd5aa8fd68a6b80f.png"
}
