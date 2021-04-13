package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CannonmasterSmythe_62976 : Card() {
    override val id = 62976
    override val name = "火炮长斯密瑟"
    override val description = "<b>战吼：</b>将你的<b>奥秘</b>变形成为3/3的士兵。当士兵死亡时，会变回 <b>奥秘</b>。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“斯密瑟，能和你一起为联盟效力，真是爽爆了。”"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ace71c8af1ec83afa883b78e121ace0872a5b08bf9d3a54735b4c8ddf4f38318.png"
}
