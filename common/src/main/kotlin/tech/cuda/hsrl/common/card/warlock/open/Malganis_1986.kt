package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Malganis_1986 : Card() {
    override val id = 1986
    override val name = "玛尔加尼斯"
    override val description = "你的其他恶魔获得+2/+2。你的英雄获得<b>免疫</b>。"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "背叛这种事情，如果是主角做了，他就会翻开历史新的一页；如果是配角做了，他的牺牲会帮助主角翻开历史新的一页。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc88e56df92ed9a9ee535c626ae4e6838cd774f1d30e37873c3242d8cd1e6c1a.png"
}
