package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Evolve_38266 : Card() {
    override val id = 38266
    override val name = "异变"
    override val description = "随机将你的 所有随从变形成为法力值消耗增加（1）点的随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "诡异的眼球，黏滑的触须，阴阳怪气的语调……这种变化不要也罢。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a71cde34e67bd6efaa218f1741c0fd6437eab20cda57c6408a86d62c544b597d.png"
}
