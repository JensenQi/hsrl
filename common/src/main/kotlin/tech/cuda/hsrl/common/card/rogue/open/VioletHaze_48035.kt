package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletHaze_48035 : Card() {
    override val id = 48035
    override val name = "紫色烟雾"
    override val description = "随机将两张<b>亡语</b>牌置入你的 手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "精英牛头人酋长的下一首热门单曲——紫色烟雾。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/25533acf4fd06f16da7c59c10b50fdcdec5235fd60df27cce928e3cd924f0f74.png"
}
