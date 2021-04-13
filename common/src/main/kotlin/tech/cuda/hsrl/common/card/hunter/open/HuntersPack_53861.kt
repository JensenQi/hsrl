package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HuntersPack_53861 : Card() {
    override val id = 53861
    override val name = "猎人工具包"
    override val description = "随机将一张猎人野兽牌，<b>奥秘</b>牌和武器牌分别置入你的 手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "看！这是陷阱！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/19b8a7604e25cf06a6c6884deb28e630a540398135eacefd23f3c6d42a6a2924.png"
}
