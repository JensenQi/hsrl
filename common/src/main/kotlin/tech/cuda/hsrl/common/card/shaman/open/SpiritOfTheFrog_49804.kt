package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheFrog_49804 : Card() {
    override val id = 49804
    override val name = "青蛙之灵"
    override val description = "<b>潜行</b>一回合。每当你施放一个法术，从你的牌库中抽取一张法力值消耗增加（1）点的法术牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "可怜的沃恩至今下落不明。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32052edd08a8a9f19666fd8ba6626092ccfba0e81506aa1e3d25738b364e8055.png"
}
