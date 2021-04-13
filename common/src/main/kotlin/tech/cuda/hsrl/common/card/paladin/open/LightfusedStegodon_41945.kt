package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightfusedStegodon_41945 : Card() {
    override val id = 41945
    override val name = "光注剑龙"
    override val description = "<b>战吼：</b><b>进化</b>你的白银之手新兵。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "这样进化的好处是不担心走夜路了。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/74fb729f06f8787b40e39d8b1f15a83588dffa3c38d3145b50776f17e4a9c7cf.png"
}
