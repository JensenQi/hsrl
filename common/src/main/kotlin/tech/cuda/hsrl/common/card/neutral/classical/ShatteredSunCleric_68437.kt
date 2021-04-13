package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShatteredSunCleric_68437 : Card() {
    override val id = 68437
    override val name = "破碎残阳祭司"
    override val description = "<b>战吼：</b>使一个友方随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他们会随身带着一瓶太阳井能量饮料！"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab94e76bc51bfd45930aeaa89dc7e6322897e9386e216a3e97c93355e0f674d3.png"
}
