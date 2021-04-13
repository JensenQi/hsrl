package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlagueOfMurlocs_53985 : Card() {
    override val id = 53985
    override val name = "鱼人之灾祸"
    override val description = "随机将所有随从变形成为鱼人。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "这也太可怕（ai）了吧！"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/24774574c49bc65b75dfead8acfdce61717bb0bf496025a991d30b582e561e4d.png"
}
