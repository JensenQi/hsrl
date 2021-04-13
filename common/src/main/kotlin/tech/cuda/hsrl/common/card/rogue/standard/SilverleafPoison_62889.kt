package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverleafPoison_62889 : Card() {
    override val id = 62889
    override val name = "银叶草药膏"
    override val description = "使你的武器获得“在你的英雄攻击后，抽一张牌。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "卡扎库斯下药的方式越来越直接了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a4a21f8182a720c80bdf40c654611958ce523eed7782b4d220a3d6944ef3f2bf.png"
}
