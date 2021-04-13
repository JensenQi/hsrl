package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightshowerElemental_62874 : Card() {
    override val id = 62874
    override val name = "光沐元素"
    override val description = "<b>嘲讽</b>，<b>亡语：</b>为所有友方角色恢复 8点生命值。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "气象节目说，外面的天气可以洗澡了。你带好了伞，发现是日光浴。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b6261b51819dca2fa228aef789fcfb687a3a3a5f568604a285f2d2e0ecd1f079.png"
}
