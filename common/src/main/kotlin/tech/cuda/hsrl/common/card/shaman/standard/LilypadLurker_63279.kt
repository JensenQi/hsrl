package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LilypadLurker_63279 : Card() {
    override val id = 63279
    override val name = "荷塘潜伏者"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则将一个敌方随从变形成为一只0/1并具有<b>嘲讽</b>的青蛙。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "平心而论，青蛙是无辜的。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/537a45130fe7ea7e0326b2f7e2bcb2efc6511ab0b89cbcf84beff89a26a16f43.png"
}
