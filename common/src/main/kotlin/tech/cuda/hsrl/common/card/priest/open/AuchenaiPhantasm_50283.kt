package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AuchenaiPhantasm_50283 : Card() {
    override val id = 50283
    override val name = "奥金尼幻象"
    override val description = "<b>战吼：</b>在本回合中，你的治疗效果转而造成等量的伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“宝宝们记得等我们走了再放治疗哦。”"
    override val artist = "Lemon Sky"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/459bc148ed381bb5bb4cde511311dcdff800108443008a05433f02c8b3f3e827.png"
}
