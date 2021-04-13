package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Blur_58607 : Card() {
    override val id = 58607
    override val name = "疾影"
    override val description = "在本回合中，你的英雄无法受到伤害。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "“你想说什么？告诉我，我能躲开大斧头？”“我想说的是，如果你是个恶魔猎手，你根本不用躲。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ed988c7b4a13962d2d9f32033ac9e38dd3bd9ab1023b7fb2fb6316e9d14e747.png"
}
