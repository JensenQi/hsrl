package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TamsinRoame_63218 : Card() {
    override val id = 63218
    override val name = "塔姆辛·罗姆"
    override val description = "每当你施放法力值消耗大于或等于（1）点的暗影法术时，将法术牌的一张复制置入你的手牌，其法力值消耗为（0）点。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "生前，塔姆辛是联盟最具天赋的法师之一；现在，她是部落最为危险的术士。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b9e156827a31516b46ed641bc51432ff56a38d37027605ae8d9b6ff32342ea8.png"
}
