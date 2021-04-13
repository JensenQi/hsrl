package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MastersCall_50212 : Card() {
    override val id = 50212
    override val name = "主人的召唤"
    override val description = "从你的牌库中<b>发现</b>一张随从牌。如果三张牌都是野兽，则抽取全部三张牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“喂？对，主人，我是霍弗。”"
    override val artist = "Rudy Siswanto"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4b707bb1eed29fe26562ef186be073a42e68d2505b5f785770656d43b28694c.png"
}
