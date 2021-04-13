package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HuntingParty_53099 : Card() {
    override val id = 53099
    override val name = "狩猎盛宴"
    override val description = "复制你手牌中的所有野兽牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "最后所有人都站在了自己身边，这大概不能算是一次美好的盛宴。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4bdd8d48d9fb66213c9cd55d45d64a4e26485e28e33132040cfe3f742e6064ac.png"
}
