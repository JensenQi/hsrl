package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RainOfToads_50547 : Card() {
    override val id = 50547
    override val name = "蟾蜍雨"
    override val description = "召唤三个2/4并具有<b>嘲讽</b>的蟾蜍。 <b>过载：</b>（3）"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“噫，这就是她带来疾病的方式！”"
    override val artist = "Cicily He"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9276574f32d56792dea7476ea3109640b90bdb686448aedc6e49f9fa6abb4065.png"
}
