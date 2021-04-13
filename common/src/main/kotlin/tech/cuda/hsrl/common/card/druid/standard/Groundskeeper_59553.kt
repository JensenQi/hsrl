package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Groundskeeper_59553 : Card() {
    override val id = 59553
    override val name = "园地管理员"
    override val description = "<b>嘲讽，战吼：</b>如果你的手牌中有法力值消耗大于或等于（5）点的法术牌，恢复5点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "想让树妖在不踩到花花草草的前提下管理园地，实在有点难。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a2548745fc0768912fbdd6b4e2be2d12aa645686a8db69471a2a75892aafa3a0.png"
}
