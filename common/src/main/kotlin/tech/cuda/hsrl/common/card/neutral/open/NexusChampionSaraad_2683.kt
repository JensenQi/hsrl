package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NexusChampionSaraad_2683 : Card() {
    override val id = 2683
    override val name = "虚灵勇士萨兰德"
    override val description = "<b>激励：</b>随机将一张法术牌置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "虚灵也有自己的枪术比赛，萨兰德是本届比赛的冠军，同时他还是虚灵吃热狗大赛的冠军。"
    override val artist = "Marcelo Vignali"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf16804fe2dec4d90d6db16e7cb52fce32a10cdf37b411c6318f76c3587c9593.png"
}
