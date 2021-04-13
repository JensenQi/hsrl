package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StormforgedAxe_69896 : Card() {
    override val id = 69896
    override val name = "雷铸战斧"
    override val description = "<b>过载：</b>（1）"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "哟，真是把不错的斧子。"
    override val artist = "Nate Bowden"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/115233c47ccaf4e9c4f8a49f7c4dd7ec0503f44ebc2e8e74bfbf8b2fb5255eb2.png"
}
