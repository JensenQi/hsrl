package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NineLives_52082 : Card() {
    override val id = 52082
    override val name = "九命兽魂"
    override val description = "<b>发现</b>一个在本局对战中死亡的友方<b>亡语</b>随从，并触发其 <b>亡语</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "小心这个活死兽之夜！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/97a2071dbf84e48fd15215592d38452609e82ab613262111a6406aa101c4cce0.png"
}
