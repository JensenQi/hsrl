package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JourneyBelow_38393 : Card() {
    override val id = 38393
    override val name = "深渊探险"
    override val description = "<b>发现</b>一张<b>亡语</b>牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "深渊深处究竟有什么？恐怕只有深埋地底的人才知道。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60175d660eb2963af7466c1c5f056de05ef0bd875d8ebcb79461ca7234e38617.png"
}
