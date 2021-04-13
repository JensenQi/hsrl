package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkIronSkulker_2291 : Card() {
    override val id = 2291
    override val name = "黑铁潜藏者"
    override val description = "<b>战吼：</b> 对所有未受伤的敌方随从造成2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Brm
    override val background = "他最喜欢在不为人知的地方躲起来。所以他的朋友们经常会很担心，害怕他一不小心掉进岩浆里了。"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ae6139fe7316f92303021fe66e0bc567fe3b2b60601db0ed60a3da9db3d09fdf.png"
}
