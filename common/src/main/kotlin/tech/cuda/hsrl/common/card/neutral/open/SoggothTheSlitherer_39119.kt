package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoggothTheSlitherer_39119 : Card() {
    override val id = 39119
    override val name = "深渊滑行者索苟斯"
    override val description = "<b>嘲讽</b> 无法成为法术或英雄技能的目标。"
    override var cost: Int? = 9
    override var health: Int? = 9
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "千万别告诉索苟斯将来它会被主宰之剑给干掉，还有它的颅骨后来成为了艾泽拉斯非常热门的旅游景点……"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8fac3ff6457b1d4f9016dac24f0d426d4a837b695eaa729f2acfe6d0ac1cea94.png"
}
