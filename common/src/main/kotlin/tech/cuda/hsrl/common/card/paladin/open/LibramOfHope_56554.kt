package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LibramOfHope_56554 : Card() {
    override val id = 56554
    override val name = "希望圣契"
    override val description = "恢复8点生命值。召唤一个8/8并具有<b>嘲讽</b>和<b>圣盾</b>的 守卫。"
    override var cost: Int? = 9
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "感谢这些白衣勇士。守卫生命，守卫希望。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6ae31afe9cdea33d3e4f15eecc049fd6a3e93a96c4b1ae32380ef5b9f7e0da99.png"
}
