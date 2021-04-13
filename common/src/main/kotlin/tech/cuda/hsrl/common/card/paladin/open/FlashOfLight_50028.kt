package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlashOfLight_50028 : Card() {
    override val id = 50028
    override val name = "圣光闪现"
    override val description = "恢复 4点生命值。抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "早知道戴上氪金护目镜了！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3af14cd52c69e2ad6bcfa61da6c1717f80009960ae712dbc9650be3c2cf6f3aa.png"
}
