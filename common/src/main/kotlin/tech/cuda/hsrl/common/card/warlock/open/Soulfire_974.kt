package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Soulfire_974 : Card() {
    override val id = 974
    override val name = "灵魂之火"
    override val description = "造成 4点伤害，随机弃一 张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "是把别人的灵魂点燃？还是用自己的灵魂把别人点燃？这似乎是有很大区别的。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6193c02292d618bcc4203031a6437ff99a72a2f3a8c9ad83ccc1c73b42d56036.png"
}
