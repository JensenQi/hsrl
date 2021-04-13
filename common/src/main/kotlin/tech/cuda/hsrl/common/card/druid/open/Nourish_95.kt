package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nourish_95 : Card() {
    override val id = 95
    override val name = "滋养"
    override val description = "<b>抉择：</b>获得两个法力水晶；或者抽三张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "德鲁伊能够从很多地方获得精神上的滋养：自然的伟力；鸟儿的鸣唱；蛋糕的美味。"
    override val artist = "Terese Nielsen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3d74a701b409f9090d994a31a1688d6531bb818635504e546ef9ce0f636c4347.png"
}
