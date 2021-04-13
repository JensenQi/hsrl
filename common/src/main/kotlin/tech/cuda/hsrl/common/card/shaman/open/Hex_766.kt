package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Hex_766 : Card() {
    override val id = 766
    override val name = "妖术"
    override val description = "使一个随从变形成为一只0/1并具有<b>嘲讽</b>的青蛙。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "如果你对一个鱼人使用妖术...其实结果也没什么变化，对不对？"
    override val artist = "Steve Hui"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0de7a8ffa81bb28b5e4c80be33df067b164f5b32e45f6feefe08b2cb9e2bd68c.png"
}
