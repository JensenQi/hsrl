package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shimmerfly_52894 : Card() {
    override val id = 52894
    override val name = "闪光蝴蝶"
    override val description = "<b>亡语：</b> 随机将一张猎人法术牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "一个蝴蝶哼哼哼，两个蝴蝶嗡嗡嗡。"
    override val artist = "Cecile He"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a74a130618c3e3ae11e74a9159a89aa8de29489a5fbeb304d90cb418aec240b.png"
}
