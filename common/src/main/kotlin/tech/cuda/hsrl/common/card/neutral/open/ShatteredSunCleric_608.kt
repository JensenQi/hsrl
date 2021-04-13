package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShatteredSunCleric_608 : Card() {
    override val id = 608
    override val name = "破碎残阳祭司"
    override val description = "<b>战吼：</b>使一个友方随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "他们会随身带着一瓶太阳井能量饮料！"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/472e9de5e1647356ba5c944f0327860ef02bdc2f0dc1e1b38332cab2e2c46ad0.png"
}
