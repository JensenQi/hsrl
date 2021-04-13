package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CathedralGargoyle_47416 : Card() {
    override val id = 47416
    override val name = "教堂石像兽"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，则获得<b>嘲讽</b>和<b>圣盾</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "心有鲲鹏，落地成石。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0fc59a10978d59bfa1b34f23bc48016dda60561ff40fb12b65fee97651dc679a.png"
}
