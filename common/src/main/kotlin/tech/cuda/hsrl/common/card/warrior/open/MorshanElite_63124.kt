package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MorshanElite_63124 : Card() {
    override val id = 63124
    override val name = "莫尔杉精锐"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>在本回合中，如果你的英雄进行过攻击，则召唤一个该随从的复制。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“不管刷过多少木桩，兽人都算不上可怕；蹲尸体的兽人才是真的可怕！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6d267c18296365b4e5d926071590692a5060788c328c3a2f786d5209ee7fc6ac.png"
}
