package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nourish_69871 : Card() {
    override val id = 69871
    override val name = "滋养"
    override val description = "<b>抉择：</b>获得两个法力水晶；或者抽三张牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "德鲁伊能够从很多地方获得精神上的滋养：自然的伟力；鸟儿的鸣唱；蛋糕的美味。"
    override val artist = "Terese Nielsen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/54117e8f99c750bf3b7c03a6e21a03cfad834b985b4bd9a9cc942e37becf99f6.png"
}
