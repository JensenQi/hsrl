package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nourish_69594 : Card() {
    override val id = 69594
    override val name = "滋养"
    override val description = "<b>抉择：</b>获得两个法力水晶；或者抽三张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "德鲁伊能够从很多地方获得精神上的滋养：自然的伟力；鸟儿的鸣唱；蛋糕的美味。"
    override val artist = "Terese Nielsen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ec2cf162fc5d4edf77165adf87a7724f497cf6e82983371ebbdb973484bcbc0.png"
}
