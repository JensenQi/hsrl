package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnidentifiedElixir_45759 : Card() {
    override val id = 45759
    override val name = "未鉴定的药剂"
    override val description = "使一个随从获得+2/+2。在你手牌中时获得额外效果。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“嘿，尝尝这个。”（咕嘟嘟）“这是什么？”“我也不知道，在实验室找到的。”"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7f6b6d00c57a8218d8706f831d10f584bf34f82e2a735af604f9516cad0c9edb.png"
}
